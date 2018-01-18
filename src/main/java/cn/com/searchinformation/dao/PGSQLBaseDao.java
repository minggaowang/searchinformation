package cn.com.searchinformation.dao;

import cn.com.searchinformation.model.ITDepartmentModel;
import cn.com.searchinformation.model.ProblemTypeCountModel;
import cn.com.searchinformation.model.RegisterCountModel;

import java.util.List;

public interface PGSQLBaseDao {
    public RegisterCountModel selectRegistersCount();

    public List<ProblemTypeCountModel> selectProblemTypeCount();

    public List<ITDepartmentModel> selectITDepartmentCount();
}
