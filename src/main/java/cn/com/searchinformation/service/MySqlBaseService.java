package cn.com.searchinformation.service;


import cn.com.searchinformation.model.*;

import java.util.List;

public interface MySqlBaseService {

    /**
     * 提取注册数据
     * @return
     */
    public List<RegisterCountModel> selectRegistersCount();

    /**
     * 插入注册数据
     * @param registersCountModel
     * @return
     */
    public String insertRegistersCount(RegisterCountModel registersCountModel);

    /**
     * 提取问题模块
     * @return
     */
    public List<ProblemTypeCountModel> selectProblemTypeCount();

    /**
     * 插入问题模块
     * @param list
     * @return
     */
    public void insertProblemTypeCount(List<ProblemTypeCountModel> list);

    /**
     * 提取问题模块
     * @return
     */
    public List<ITDepartmentModel> selectITDepartmentCount();

    /**
     * 插入问题模块
     * @param list
     * @return
     */
    public void insertITDepartment(List<ITDepartmentModel> list);

    /**
     * 授权类型对比
     * @return
     */
    public List<ProductTypeRatioModel> selectProductTypeRatioCount();

    /**
     * 运营商，代理商分布
     * @return
     */
    public List<AgentRatioModel> selectAgentRatioCount();

    /**
     * 地域分布
     * @return
     */
    public List<AreaRatioModel> selectAreaRatioCount();

    /**
     * 用户行业分布
     * @return
     */
    public List<IndustryRatioModel> selectIndustryRatioCount();

    /**
     * 获取采集时间
     * @return
     */
    public String getCollectionTime();

}
