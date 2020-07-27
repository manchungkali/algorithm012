class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        //遍历处理
        //将字符串下标对应的值赋值给新字符串数组
        for (int i = 0;i < indices.length; i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return new String(chars);

    }


}