package com.example.demo.secutrity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.models.EmpleadoModel;
import com.example.demo.repositories.EmpleadoRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException{

        EmpleadoModel empleado = empleadoRepository.findOneByUsuario(user)
            .orElseThrow(() -> new UsernameNotFoundException("El usuario con user " + user + "no existe"));

            return new UserDetailsImpl(empleado);
    }

}
