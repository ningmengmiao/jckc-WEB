package cn.bptop.jckc.service;

import cn.bptop.jckc.entity.KcPersonalInfo;

import java.util.List;

/**
 * (KcPersonalInfo)表服务接口
 *
 * @author makejava
 * @since 2020-02-17 15:58:42
 */
public interface KcPersonalInfoService
{

    /**
     * 通过ID查询单条数据
     *
     * @param piId 主键
     * @return 实例对象
     */
    KcPersonalInfo queryById(Integer piId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<KcPersonalInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param kcPersonalInfo 实例对象
     * @return 实例对象
     */
    KcPersonalInfo insert(KcPersonalInfo kcPersonalInfo);

    /**
     * 修改数据
     *
     * @param kcPersonalInfo 实例对象
     * @return 实例对象
     */
    KcPersonalInfo update(KcPersonalInfo kcPersonalInfo);

    /**
     * 通过主键删除数据
     *
     * @param piId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer piId);
}