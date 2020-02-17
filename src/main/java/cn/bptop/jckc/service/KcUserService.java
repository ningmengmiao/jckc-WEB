package cn.bptop.jckc.service;

import cn.bptop.jckc.entity.KcUser;

import java.util.List;

/**
 * (KcUser)表服务接口
 *
 * @author makejava
 * @since 2020-02-17 15:58:42
 */
public interface KcUserService
{

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    KcUser queryById(Integer userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KcUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param kcUser 实例对象
     * @return 实例对象
     */
    KcUser insert(KcUser kcUser);

    /**
     * 修改数据
     *
     * @param kcUser 实例对象
     * @return 实例对象
     */
    KcUser update(KcUser kcUser);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userId);
}