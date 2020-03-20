package com.go2.shipping.common;

import java.util.Map;

public class StringUtil {
	/**
	 * 是否为空
	 * 
	 * @param str
	 * @return
	 * @author yuhang
	 */
	public static boolean isNotEmpty(String str) {
		if (null != str && !"".equals(str.trim())) {
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty(String str){
		return !isNotEmpty(str);
	}

	/**
	 * 过滤特定字符串
	 * 
	 * @param str
	 * @param filter
	 * @return
	 * @author yuhang
	 */
	public static String filterString(String str, String filter) {
		return str.replace(filter, "");
	}

	/**
	 * 添加模糊查询条件
	 * @date 2016年4月29日
	 * @author yuhang
	 */
	public static String addLike(String str) {
		if (isNotEmpty(str)) {
			return "%" + str.trim() + "%";
		} else {
			return null;
		}
	}
	/**
	 * 时间
	 * @date 2016年5月6日
	 * @author yuhang
	 */
	public static Map<String,Object> putValue(Map<String,Object> map,String begin,String end){
		if(isNotEmpty(begin)){
			map.put("startTime", DateUtils.parseDate(begin+" 00:00:00"));
		}
		if(isNotEmpty(end)){
			map.put("endTime", DateUtils.parseDate(end+" 23:59:59"));
		}
		return map;
	}
	/**
	 * 去除去空字符串
	 * @date 2016年5月9日
	 * @author yuhang
	 */
	public static String trimString(String str){
		if(isNotEmpty(str)){
			return str.trim();
		}
		return null;
	}
	
	//czl add 字符串转换为枚举值
	public static <T> T stateParse(Class<T> ref , String value, Object defaultValue){  
        @SuppressWarnings("unchecked")
		T state = (T)defaultValue;   
        if(ref.isEnum()){
            T[] ts = ref.getEnumConstants() ;   
            for(T t : ts){  
                String code = t.toString();   
                if(value.toUpperCase().equals(code)){  
                	state = t;   
                    break ;   
                }  
            }  
        }  
        return state ;   
    }
	
	public static String nullRevort(String str){
		if(str == null)
			return "";
		return str;
	}
	
	
	public static String putStartTime(Object value){
		if(value!=null && isNotEmpty(value.toString())){
			return DateUtils.formatDate(DateUtils.parseDate(value+" 00:00:00"),"yyyy-MM-dd HH:mm:ss");
		}
		return null;
	}
	
	public static String putEndTime(Object value){
		if(value!=null && isNotEmpty(value.toString())){
			return DateUtils.formatDate(DateUtils.parseDate(value+" 23:59:59"),"yyyy-MM-dd HH:mm:ss");
		}
		return null;
	}
	
	
	public static String toDBC(String input) {
		if (null != input) {
			char c[] = input.toCharArray();
			for (int i = 0; i < c.length; i++) {
				if ('\u3000' == c[i]) {
					c[i] = ' ';
				} else if (c[i] > '\uFF00' && c[i] < '\uFF5F') {
					c[i] = (char) (c[i] - 65248);
				}
			}
			String dbc = new String(c);
			return dbc;
		} else {
			return null;
		}
	}
	/**
	 * 
	 * @param artNo
	 * @return
	 */
	public static String getArtNo(String artNo){
		String no = getKArtNo(artNo);
		return getMgArtNo(no, artNo);
	}
	
	public static String getKArtNo(String artNo){
		if (isEmpty(artNo)) {
			return artNo;
		}
		String[] arts = artNo.split("\\&");
		if (arts.length > 2 || arts.length < 2) {
			return artNo;
		}
		String[] fstr = arts[0].split("\\-");
		if (fstr.length > 2 || fstr.length < 2) {
			return artNo;
		}
		if (fstr[1].contains("_") && fstr[1].length() == 17) {
			String artNoTmp = fstr[0] + "&" + arts[1];
			return artNoTmp;
		}
		return artNo;
	}
	public static String getMgArtNo(String artNo,String oldArtNo){
		if(StringUtil.isEmpty(artNo)|| StringUtil.isEmpty(oldArtNo)){
			return oldArtNo;
		}
		if(!artNo.equals(oldArtNo)){
			return artNo;
		}
		if(oldArtNo.contains("&")){
			return artNo;
		}
		String[] arr = oldArtNo.split("\\-");
		if(arr.length!=3){
			return artNo;
		}
		return arr[0]+ "&" + arr[1];
	}
	
	public static String replaceGoods(String source, String old, String rstr) {
		String result = "";
		if (source.contains("|")) {
			String[] names = source.split("\\|");
			boolean isOk = false;
			for (String name : names) {
				if (name.equals(old)) {
					if (!isOk) {
						isOk = true;
						name = rstr;
					}
				}

				if (!"".equals(name)) {
					result = result + "|" + name;
				}
			}
			return result.substring(1, result.length());
		} else {
			result = source.replace(old, rstr);
		}

		return result;
	}
	
	public static String trimKgString(String str) {
		return str.trim().replaceAll(" ", "").replaceAll("  ", "").replaceAll(" ", "");
	}
	
 
	
	
	/**
	 * 是否大小码
	 * @param str
	 * @return
	 * boolean
	 */
	public static boolean isBigOrSmall(String str) {
		String[] sizes = new String[] { "34", "35", "36", "37", "38", "39" };
		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i].equals(str)) {
				return false;
			}
		}
		return true;
	}
}
