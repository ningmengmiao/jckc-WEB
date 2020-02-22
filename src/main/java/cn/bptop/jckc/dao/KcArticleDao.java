package cn.bptop.jckc.dao;

import cn.bptop.jckc.entity.KcArticle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (KcArticle)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-20 10:42:43
 */
@Mapper
@Repository
public interface KcArticleDao
{

    /**
     * 通过ID查询单条数据
     *
     * @param aArticleId 主键
     * @return 实例对象
     */
    KcArticle queryById(Integer aArticleId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KcArticle> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param kcArticle 实例对象
     * @return 对象列表
     */
    List<KcArticle> queryAll(KcArticle kcArticle);

    /**
     * 新增数据
     *
     * @param kcArticle 实例对象
     * @return 影响行数
     */
    int insert(KcArticle kcArticle);

    /**
     * 修改数据
     *
     * @param kcArticle 实例对象
     * @return 影响行数
     */
    int update(KcArticle kcArticle);

    /**
     * 通过主键删除数据
     *
     * @param aArticleId 主键
     * @return 影响行数
     */
    int deleteById(Integer aArticleId);
}