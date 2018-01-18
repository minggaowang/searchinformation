package cn.com.searchinformation.dao;

import cn.com.searchinformation.model.*;

import java.util.List;

public interface MySqlBaseDao {
    public List<RegisterCountModel> selectRegistersCount();
    public String insertRegistersCount(RegisterCountModel registerCountModel);
    public List<ProblemTypeCountModel> selectProblemTypeCount();
    public String insertProblemTypeCount(ProblemTypeCountModel problemTypeCountModel);
    public List<ITDepartmentModel> selectITDepartmentCount();
    public String insertITDepartment(ITDepartmentModel itDepartmentModel);
    public List<ProductTypeRatioModel> selectProductTypeRatioCount();
    public List<AgentRatioModel> selectAgentRatioCount();
    public List<AreaRatioModel> selectAreaRatioCount();
    public List<IndustryRatioModel> selectIndustryRatioCount();
    public String getCollectionTime();

}
