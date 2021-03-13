package MyBatisStart.dao;

// DATE: 2021/2/19-19:39  Happy Every Day


import MyBatisStart.pojo.Blog;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

public interface blogMapper {
    //插入
    @Insert("insert  into blog (id,title,author,create_time,views) value (#{id},#{title},#{author},#{createTime},#{views})")
    public void addBlog(Blog blog);
    //查询
    public List<Blog> getBlogByIF(Map map);
    //修改
    public void updateBlog(Map map);
    //按指定属性 查询
    public List<Blog> getBlogByForeach(Map map);
   // void addBlog(String s, String java入门到放弃, String 范蹦, Date date, int i);
    //按id查询
//    @Select("select * from blog where id=#{id}")
    public Blog getBlogById(int id);
}
