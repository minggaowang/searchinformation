package cn.com.searchinformation.service;

import cn.com.searchinformation.model.ITDepartmentModel;
import cn.com.searchinformation.model.ProblemTypeCountModel;
import cn.com.searchinformation.model.RegisterCountModel;

import java.util.List;

public interface PGSQLBaseService {

    /**
     * 提取注册数据
     * @return
     */
    public RegisterCountModel selectRegistersCount();

    /**
     * 提取问题模块
     * @return
     */
    public List<ProblemTypeCountModel> selectProblemTypeCount();

    /**
     * 提取部门信息
     * @return
     */
    public List<ITDepartmentModel> selectITDepartmentCount();
}
