package cn.bptop.jckc.dao;

import cn.bptop.jckc.entity.KcUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (KcUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-17 15:58:41
 */
public interface KcUserDao
{

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    KcUser queryById(Integer userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KcUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param kcUser 实例对象
     * @return 对象列表
     */
    List<KcUser> queryAll(KcUser kcUser);

    /**
     * 新增数据
     *
     * @param kcUser 实例对象
     * @return 影响行数
     */
    int insert(KcUser kcUser);

    /**
     * 修改数据
     *
     * @param kcUser 实例对象
     * @return 影响行数
     */
    int update(KcUser kcUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Integer userId);
}