package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Role;
import web.repositories.RoleRepository;

@Service
public class RoleService {

    @Autowired
    private RoleRepository repository;

    public Role findByRoleName(String roleName) {
        return repository.findByRole(roleName);

    }

}
