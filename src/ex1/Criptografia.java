package ex1;

import java.util.ArrayList;
import java.util.List;

public class Criptografia {
	private int deslocamento;
	List<Character> lista = new ArrayList<Character>();
	private String mesnagem;

	public int getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(int deslocamento) {
		this.deslocamento = deslocamento;
	}

	public String getMesnagem() {
		return mesnagem;
	}

	public void setMesnagem(String mesnagem) {
		this.mesnagem = mesnagem;
	}

	Criptografia(String texto, int deslocamento) {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			this.lista.add(Character.valueOf(ch));
		}
		this.deslocamento = deslocamento;
		this.mesnagem = texto;
	}

	public char[] criptografar() {
		char[] texto = this.mesnagem.toUpperCase().toCharArray();
		char aux;
		for (int j = 0; j < texto.length; j++) {
			aux = texto[j];
			for (int i = 0; i < lista.size(); i++) {
				if (texto[j] != ' ') {
					if (aux == this.lista.get(i)) {
						
						if(i + this.deslocamento < lista.size())
						{
							texto[j] = lista.get(i + this.deslocamento);
						}
						// Se o deslocamento ultrapassar o tamanho de letras disponiveis
						else if(i + this.deslocamento >= lista.size())
						{
							//O texto voltará para o inicio do array de criptografia
							texto[j] = lista.get((i + this.deslocamento) - lista.size());
						}
						
					}
				}
			}
		}
		return texto;
	}
	
	public char[] descriptografar()
	{
		char[] texto = this.mesnagem.toUpperCase().toCharArray();
		char aux;
		for (int j = 0; j < texto.length; j++) {
			aux = texto[j];
			for (int i = 0; i < lista.size(); i++) {
				if (texto[j] != ' ') {
					if (aux == this.lista.get(i)) {
						
						if(this.deslocamento - 1 > 0)
						{
							texto[j] = lista.get(i - this.deslocamento);
						}
						// Se o deslocamento for menor que zero
						else if(this.deslocamento - i <= 0)
						{
							//O texto voltará para o inicio do array de criptografia
							texto[j] = lista.get((i + this.deslocamento) - lista.size());
						}
						
					}
				}
			}
		}
		return texto;
	}
}
