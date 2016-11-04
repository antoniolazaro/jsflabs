package com.pilotojsf.managedbean.demo;

import java.util.List;

import com.pilotojsf.ManagedBeanUtil;

public final class BancoDadosUtil {
	
	public static List<UsuarioModel> getUsuarios(){
		return ((BancoManagedBean)ManagedBeanUtil.getApplicationMap().get("banco")).getUsuarios();
	}

}
