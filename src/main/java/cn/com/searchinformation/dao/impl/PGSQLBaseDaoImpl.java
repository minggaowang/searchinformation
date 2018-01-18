package cn.com.searchinformation.dao.impl;

import cn.com.searchinformation.dao.PGSQLBaseDao;
import cn.com.searchinformation.mapper.PGSQLBaseMapper;
import cn.com.searchinformation.model.ITDepartmentModel;
import cn.com.searchinformation.model.ProblemTypeCountModel;
import cn.com.searchinformation.model.RegisterCountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PGSQLBaseDaoImpl implements PGSQLBaseDao {
    @Autowired
    private PGSQLBaseMapper pgsqlBaseMapper;

    @Override
//    @DataSourceTypeAnno(DataSourceEnum.pgsql)
    public RegisterCountModel selectRegistersCount(){
        return pgsqlBaseMapper.selectRegistersCount();
    }

    @Override
//    @DataSourceTypeAnno(DataSourceEnum.pgsql)
    public List<ProblemTypeCountModel> selectProblemTypeCount(){
        return pgsqlBaseMapper.selectProblemTypeCount();
    }

    @Override
//    @DataSourceTypeAnno(DataSourceEnum.pgsql)
    public List<ITDepartmentModel> selectITDepartmentCount(){
        return pgsqlBaseMapper.selectITDepartmentCount();

    }
}
