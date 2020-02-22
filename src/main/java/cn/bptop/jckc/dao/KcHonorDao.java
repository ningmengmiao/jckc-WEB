package cn.bptop.jckc.dao;

import cn.bptop.jckc.entity.KcHonor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (KcHonor)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-17 15:58:42
 */
@Mapper
@Repository
public interface KcHonorDao
{

    /**
     * 通过ID查询单条数据
     *
     * @param hHonorId 主键
     * @return 实例对象
     */
    KcHonor queryById(Integer hHonorId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KcHonor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param kcHonor 实例对象
     * @return 对象列表
     */
    List<KcHonor> queryAll(KcHonor kcHonor);

    /**
     * 新增数据
     *
     * @param kcHonor 实例对象
     * @return 影响行数
     */
    int insert(KcHonor kcHonor);

    /**
     * 修改数据
     *
     * @param kcHonor 实例对象
     * @return 影响行数
     */
    int update(KcHonor kcHonor);

    /**
     * 通过主键删除数据
     *
     * @param hHonorId 主键
     * @return 影响行数
     */
    int deleteById(Integer hHonorId);
}