package br.edu.Uteis;

public class Util {
	public static int calculo(int h_i,int m_i,int h_f,int m_f) {
		int total_h, total_min, total;
		
		if (m_f < m_i) {
			m_f = m_f + 60;
			h_f = h_f -1;
		}
		if (h_f < h_i) {
			h_f = h_f + 24;
		}
		total_min = m_f - m_i;
		total_h = h_f - h_i;
		total = total_h * 60 * total_min;
		return total;

}
}
