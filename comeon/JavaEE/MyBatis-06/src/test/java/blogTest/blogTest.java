package blogTest;

// DATE: 2021/2/19-17:03  Happy Every Day


import MyBatisStart.dao.blogMapper;
import MyBatisStart.pojo.Blog;
import MyBatisStart.utils.MyBatisUtils;
import MyBatisStart.utils.gongjulei;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class blogTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        blogMapper blogMapper = sqlSession.getMapper(blogMapper.class);
        Date date = new Date();
        System.out.println(date);
        blogMapper.addBlog(new Blog("1","SpringCloud","范蹦",date,879134));
        sqlSession.close();
    }
    @Test
    public void test1(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        blogMapper blogMapper = sqlSession.getMapper(blogMapper.class);
        HashMap<Object,Object> map = new HashMap<>();
        map.put("title","java入门到放弃");
        map.put("author","范蹦");
        map.put("views",9999);
        List<Blog> blogList = blogMapper.getBlogByIF(map);
        for(Blog blog:blogList)
            System.out.println(blog);
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        blogMapper blogMapper = sqlSession.getMapper(blogMapper.class);
        HashMap<Object, Object> map = new HashMap<>();
        Date date = new Date();
        map.put("id",1);
        map.put("views",9999);
        map.put("createTime",date);
        blogMapper.updateBlog(map);
        sqlSession.close();
    }
    @Test
    public void test3(){
//        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        SqlSession sqlSession = gongjulei.getSql();
        blogMapper blogMapper = sqlSession.getMapper(blogMapper.class);
        HashMap<Object, Object> map = new HashMap<>();
        ArrayList<Object> list = new ArrayList<>();
        list.add("java入门到放弃");
        list.add("Spring5");
        map.put("list1",list);
        List<Blog> blogByForeach = blogMapper.getBlogByForeach(map);
        for(Blog blog:blogByForeach)
            System.out.println(blog);
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        SqlSession sqlSession2 = MyBatisUtils.getSqlSession();
        blogMapper blogMapper = sqlSession.getMapper(blogMapper.class);
        MyBatisStart.dao.blogMapper blogMapper1 = sqlSession2.getMapper(blogMapper.class);
        System.out.println(blogMapper.getBlogById(1));
        sqlSession.close();

        System.out.println("**************************");
        System.out.println(blogMapper1.getBlogById(1));
        System.out.println("**************************");
        sqlSession2.close();
    }
    @Test
    public void test5(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        blogMapper blogMapper = sqlSession.getMapper(blogMapper.class);
        System.out.println(blogMapper.getBlogById(1));
//        sqlSession.clearCache();
//        System.out.println("**************************");
//        System.out.println(blogMapper.getBlogById(2));
        sqlSession.close();
    }
}
