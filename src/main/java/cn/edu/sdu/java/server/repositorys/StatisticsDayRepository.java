package cn.edu.sdu.java.server.repositorys;

import cn.edu.sdu.java.server.models.StatisticsDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StatisticsDayRepository extends JpaRepository<StatisticsDay, Integer> {
    @Query(value=" from StatisticsDay where day >=?1 and day <= ?2 order by day " )
    List<StatisticsDay> findListByDay(String startDay, String endDay);
}
