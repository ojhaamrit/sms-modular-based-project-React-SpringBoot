package org.amrit.sms1.webapi.base;

import java.util.List;

public interface BaseService<T extends BaseEntity> {

    List<T> getAll();

    T getById(Long id);

    T add(T t);

    T update(T t);

    void delete(Long id);

}
