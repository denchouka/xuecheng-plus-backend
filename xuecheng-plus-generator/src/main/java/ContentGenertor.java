/**
 * @author denchouka
 * @description 自动生成内容管理模块的PO类
 * @date 2024/8/14 22:00
 */
public class ContentGenertor {

    //生成的表
    private static final String[] TABLE_NAMES = new String[]{
            "course_base",
            "course_market",
            "course_teacher",
            "course_category",
            "teachplan",
            "teachplan_media",
            "course_publish",
            "course_publish_pre"
    };

    public static void main(String[] args) {
        GenertorUtils.genertorCommon("content", true, true, true, false, false, TABLE_NAMES);
    }
}
