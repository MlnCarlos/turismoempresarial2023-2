package com.example.turismoApp.servicios;

import com.example.turismoApp.modelos.Empresa;
import com.example.turismoApp.repositorios.EmpresaRepositorio;
import com.example.turismoApp.validaciones.EmpresaValidacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmpresaServicio {
    @Autowired
    EmpresaRepositorio empresaRepositorio;
    @Autowired
    EmpresaValidacion empresaValidacion;
    public Empresa registrarEmpresa(Empresa datosARegistrar)throws Exception {
        try{
            //Validaciones
            if(!this.empresaValidacion.validarNombre(datosARegistrar.getNombre())){
                throw new Exception("Error en el servicio");
            }

            //Falta valida el nit



            // SI PASO TODOS LOS IF ESTOY LISTO PARA LLAMAR AL REPOSITORIO
            return(this.empresaRepositorio.save(datosARegistrar));
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Empresa modificarEmpresa(Integer id, Empresa datosAModificar) throws Exception{
        try {
            //VALIDAMOS LA INFORMACIÓN
            if (!this.empresaValidacion.validarNombre(datosAModificar.getNombre())){
                throw new Exception("Longitud de caracteres invalido");
            }

            //Buscar que la empresa que tiene le id que envia el usuario
            Optional<Empresa> empresaEncontrada = this.empresaRepositorio.findById(id);
            //Pregunto si lo que busque esta vacio
            if(empresaEncontrada.isEmpty()){
                throw new Exception("Empresa no encontrada");
            }
            //Rutina POR SI, SÍ LA ENCONTRE
            //1.Convierto el opcional en la entidad respectiva
            Empresa empresaQueExiste = empresaEncontrada.get();

            //2. A la empresa que existe le cambio la información que la ususario necesita
            empresaQueExiste.setNombre(datosAModificar.getNombre());

            //3. Guardar la informacion que se acaba de edita con el SET
            return(this.empresaRepositorio.save(empresaQueExiste));

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public Empresa buscarEmpresaPorId(Integer id) throws Exception{
        try {
            Optional<Empresa> empresaEncontradaPorId = this.empresaRepositorio.findById(id);

            if(empresaEncontradaPorId.isEmpty()){
                throw new Exception("Empresa no encontrada");
            }

            return empresaEncontradaPorId.get();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Empresa> buscarTodasEmpresas() throws Exception{
        try {
            List<Empresa>listaEmpresa = this.empresaRepositorio.findAll();
            return listaEmpresa;
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public Boolean eliminarEmpresa(Integer id) throws Exception{
        try{
            Optional<Empresa> empresaOpcional = this.empresaRepositorio.findById(id);
            if (empresaOpcional.isPresent()){
                this.empresaRepositorio.deleteById(id);
                return true;
            }else {
                throw new Exception("Empresa no encontrada");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
