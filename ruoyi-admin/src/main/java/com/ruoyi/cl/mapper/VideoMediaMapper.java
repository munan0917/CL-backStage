package com.ruoyi.cl.mapper;

import java.util.List;
import com.ruoyi.cl.domain.VideoMedia;

/**
 * 视频管理Mapper接口
 * 
 * @author zqn
 * @date 2023-04-26
 */
public interface VideoMediaMapper 
{
    /**
     * 查询视频管理
     * 
     * @param id 视频管理主键
     * @return 视频管理
     */
    public VideoMedia selectVideoMediaById(Long id);

    /**
     * 查询视频管理列表
     * 
     * @param videoMedia 视频管理
     * @return 视频管理集合
     */
    public List<VideoMedia> selectVideoMediaList(VideoMedia videoMedia);

    /**
     * 新增视频管理
     * 
     * @param videoMedia 视频管理
     * @return 结果
     */
    public int insertVideoMedia(VideoMedia videoMedia);

    /**
     * 修改视频管理
     * 
     * @param videoMedia 视频管理
     * @return 结果
     */
    public int updateVideoMedia(VideoMedia videoMedia);

    /**
     * 删除视频管理
     * 
     * @param id 视频管理主键
     * @return 结果
     */
    public int deleteVideoMediaById(Long id);

    /**
     * 批量删除视频管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVideoMediaByIds(Long[] ids);
}
