package br.com.professorisidro.isilanguage.ast;

import java.util.ArrayList;

public class CommandRepetir extends AbstractCommand {

	private String condicao;
	private ArrayList<AbstractCommand> comando;

	public CommandRepetir(String condicao, ArrayList<AbstractCommand> comando) {
		this.condicao = condicao;
		this.comando = comando;
	}
	
	@Override
	public String generateJavaCode() {
		
		StringBuilder str = new StringBuilder();
		
		str.append("while (" + condicao + ") {\n");
		
		for (AbstractCommand cmd: comando) {
			str.append(cmd.generateJavaCode());
			str.append("\n");
		}
		
		str.append("}\n");
		
		return str.toString();
	}
	
	@Override
	public String toString() {
		return "CommandRepetir [A condição: " + condicao + ", com o comando: " + comando + "]";
	}



}