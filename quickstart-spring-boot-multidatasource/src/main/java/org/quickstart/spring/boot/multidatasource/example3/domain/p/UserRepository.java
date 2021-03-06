package org.quickstart.spring.boot.multidatasource.example3.domain.p;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/23 下午2:34.
 * @blog http://blog.didispace.com
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
