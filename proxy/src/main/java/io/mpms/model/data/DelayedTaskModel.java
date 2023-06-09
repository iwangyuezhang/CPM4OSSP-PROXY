/*
 *耗时任务实体
 *
 *

 */

package io.mpms.model.data;

public class DelayedTaskModel implements Comparable<DelayedTaskModel> {
    /*
     * id，由数据库设置
     */
    private Integer id;

    /*
     * 任务id，值等同id
     */
    private Integer taskId;

    /*
     * 节点id，由前端提供
     */
    private Integer nodeId;

    /*
     * 任务状态，“0、1、2、3”
     */
    private Integer taskStatus;

    /*
     * 任务优先级，“0、1、2...”
     */
    private Integer taskPriority;

    /*
     * 任务group id，由前端提供
     */
    private Integer taskGroupId;

    /*
     * 任务行为，“install、uninstall、update”
     */
    private String taskAction;
}
