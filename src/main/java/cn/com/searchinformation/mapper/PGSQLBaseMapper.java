package cn.com.searchinformation.mapper;

import cn.com.searchinformation.model.ITDepartmentModel;
import cn.com.searchinformation.model.ProblemTypeCountModel;
import cn.com.searchinformation.model.RegisterCountModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PGSQLBaseMapper {
    //    @SelectProvider(type= SysUserByMySqlProvider.class,method = "findSysByUserName")
//    @Select("SELECT TO_CHAR(TO_TIMESTAMP(CREATETIME/1000::BIGINT), 'YYYY-MM-DD') AS registerDate , NOW() AS analysisDate, COUNT(*) AS count FROM  SAAS_COMMUNITY_USERINFO  GROUP BY registerDate ORDER BY registerDate;")
    @Select("SELECT NOW() AS analysisDate, COUNT(*) AS count FROM  SAAS_COMMUNITY_USERINFO")
    public RegisterCountModel selectRegistersCount();

    @Select("SELECT NOW() AS analysisDate,WORKORDERTYPE,COUNT(*)  FROM SAAS_COMMUNITY_WORK_ORDER GROUP BY WORKORDERTYPE")
    public List<ProblemTypeCountModel> selectProblemTypeCount();

    @Select("SELECT NOW() AS analysisDate,ITMANAGEDEPARTMENT as departmentType ,COUNT(*)  FROM SAAS_COMMUNITY_USERINFO GROUP BY departmentType")
    public List<ITDepartmentModel> selectITDepartmentCount();
}
