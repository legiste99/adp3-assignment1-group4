/**
 Author: Panashe Muinzani (218186568)
 */

package ac.za.cput.service.personal;

import ac.za.cput.domain.personal.Manager;
import ac.za.cput.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository repository;

    public Manager save(Manager manager){
        return repository.save(manager);
    }

    public List<Manager> getAllManagers(){
        List<Manager> managers = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(managers::add);
        return managers;
    }

    public void deleteManagerById(String id){
        repository.deleteById(id);
    }

    // TODO: getManagerByTeamId
    public Manager getManagerByTeamId(String teamId){
        return null;
    }

    public List<Manager> getManagerById(String managerId){
        if (null != managerId){
            return repository.findAllById(Collections.singleton(managerId));
        }
        else {
            return repository.findAll();
        }
    }

    public Manager updateManager(String id, String fistName, String middleName, String lastName){
        Manager manager = repository.findById(id).get();

        manager.setFirstName(fistName);
        manager.setMiddleName(middleName);
        manager.setLastName(lastName);

        repository.save(manager);
        return manager;
    }
}
