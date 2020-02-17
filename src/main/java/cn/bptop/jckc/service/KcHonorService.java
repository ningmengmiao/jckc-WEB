package cn.bptop.jckc.service;

import cn.bptop.jckc.entity.KcHonor;

import java.util.List;

/**
 * (KcHonor)表服务接口
 *
 * @author makejava
 * @since 2020-02-17 15:58:42
 */
public interface KcHonorService
{

    /**
     * 通过ID查询单条数据
     *
     * @param hHonorId 主键
     * @return 实例对象
     */
    KcHonor queryById(Integer hHonorId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KcHonor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param kcHonor 实例对象
     * @return 实例对象
     */
    KcHonor insert(KcHonor kcHonor);

    /**
     * 修改数据
     *
     * @param kcHonor 实例对象
     * @return 实例对象
     */
    KcHonor update(KcHonor kcHonor);

    /**
     * 通过主键删除数据
     *
     * @param hHonorId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer hHonorId);
}