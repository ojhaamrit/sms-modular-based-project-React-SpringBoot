package org.amrit.sms1.webapi.base;

import java.util.List;

public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

    public BaseRepository<T> baseRepository;

    public BaseServiceImpl(BaseRepository<T> baseRepository){
        this.baseRepository = baseRepository;
    }

    @Override
    public List<T> getAll() {
        return baseRepository.findAll();
    }

    @Override
    public T getById(Long id) {
        return baseRepository.getOne(id);
    }

    @Override
    public T add(T t) {
        return baseRepository.save(t);
    }

    @Override
    public T update(T t) {
        return baseRepository.save(t);
    }

    @Override
    public void delete(Long id) {
        baseRepository.deleteById(id);
    }
}
