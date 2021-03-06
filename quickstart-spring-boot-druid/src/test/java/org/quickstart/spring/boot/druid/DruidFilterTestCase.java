package org.quickstart.spring.boot.druid;

import static org.assertj.core.api.Assertions.assertThat;
import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.pool.DruidDataSource;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quickstart.spring.boot.druid.demo.DemoApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lihengming [89921218@qq.com]
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@ActiveProfiles("filter")
public class DruidFilterTestCase {
    @Resource
    private DruidDataSource dataSource;

    @Test
    public void test() {
        List<Filter> filters = dataSource.getProxyFilters();
        assertThat(filters.size()).isEqualTo(3);
    }
}
