/*
 * Copyright 2013 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 25/09/2013 - 12:11:51
 * 
 * ================================================================================
 * 
 * Direitos autorais 2013 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 25/09/2013 - 12:11:51
 * 
 */

package org.jrimum.bopepo.parametro;

import org.jrimum.bopepo.BancosSuportados;
import org.jrimum.domkee.banco.ParametroBancario;

/**
 * Parâmetros bancários específicos para o
 * {@link BancosSuportados#BANCO_DAYCOVAL}.
 * 
 * @author <a href="https://github.com/alessandrobrunolima">Alessandro Bruno
 *         Lima</a>
 * 
 * @version 0.2.3
 * 
 * @since 0.2
 */
public enum ParametroBancoDaycoval implements ParametroBancario<ParametroBancoDaycoval> {
	/**
	 * Nome do parâmetro bancário contendo o valor do número de operação da conta.
	 */
	OPERACAO;
}
