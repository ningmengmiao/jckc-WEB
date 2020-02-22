package cn.bptop.jckc.dao;

import cn.bptop.jckc.entity.KcPersonalInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (KcPersonalInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-17 15:58:42
 */
@Mapper
@Repository
public interface KcPersonalInfoDao
{

    /**
     * 通过ID查询单条数据
     *
     * @param piId 主键
     * @return 实例对象
     */
    KcPersonalInfo queryById(Integer piId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KcPersonalInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param kcPersonalInfo 实例对象
     * @return 对象列表
     */
    List<KcPersonalInfo> queryAll(KcPersonalInfo kcPersonalInfo);

    /**
     * 新增数据
     *
     * @param kcPersonalInfo 实例对象
     * @return 影响行数
     */
    int insert(KcPersonalInfo kcPersonalInfo);

    /**
     * 修改数据
     *
     * @param kcPersonalInfo 实例对象
     * @return 影响行数
     */
    int update(KcPersonalInfo kcPersonalInfo);

    /**
     * 通过主键删除数据
     *
     * @param piId 主键
     * @return 影响行数
     */
    int deleteById(Integer piId);
}