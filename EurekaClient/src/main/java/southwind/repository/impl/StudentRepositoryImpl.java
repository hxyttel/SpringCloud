package southwind.repository.impl;

import org.springframework.stereotype.Repository;
import southwind.entity.Student;
import southwind.repository.StudentRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Long,Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",16));
        studentMap.put(2L,new Student(2L,"李四",14));
        studentMap.put(3L,new Student(3L,"王五",12));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deltteById(Long id) {
        studentMap.remove(id);
    }
}
