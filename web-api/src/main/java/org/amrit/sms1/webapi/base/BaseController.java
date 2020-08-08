package org.amrit.sms1.webapi.base;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class BaseController<T extends BaseEntity> {

    public BaseService<T> baseService;

    public BaseController(BaseService<T> baseService){
        this.baseService = baseService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<T> getAll() {
        return baseService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/id")
    T getById(@PathVariable Long id) {
        return baseService.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    T add(@RequestBody T t) {
        return baseService.add(t);
    }

    @RequestMapping(method = RequestMethod.PUT)
    T update(T t) {
        return baseService.update(t);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    void delete(Long id) {
        baseService.delete(id);
    }
}
