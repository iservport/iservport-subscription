package com.iservport.subscription;

import java.io.Serializable;
import java.util.Date;

import org.helianto.core.domain.Entity;
import org.helianto.core.domain.Operator;

/**
 * Cobrança.
 * 
 * @author mauriciofernandesdecastro
 *
 */
public class ContextCollect 
	implements Serializable
{
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private Integer version;
	
	private Operator context;
	
	private Entity entity;
	
	private Character resolution = 'T';
	
	private Character collectType = 0;
	
	/**
	 * 
	 * @param status
	 * Status da cobrança.
	 * 
	 * @param produtos
	 * Identificador do Produto, pode ser passado mais de um produto.
	 * 
	 * @param idConta
	 * Identificador da conta bancária.
	 * 
	 * @param idForma
	 * Identificador da forma de pagamento
	 * 
	 * @return
	 */
	public String CollectionList(String access_token, 
							 String app_token, 
							 String status, 
							 Integer produtos[],
							 Integer idConta,
							 Integer idForma){
		
		
		return "200";
	}
	
	/**
	 * 
	 * @param access_token
	 * Token que identifica o usuario da API.
	 * 
	 * @param app_token
	 * Token que identifica a Aplicação que está utilizando recursos da API.
	 * 
	 * @param idCobranca
	 * Identificador da cobrança
	 * 
	 * @return
	 */
	public String CollectionConsultation(String access_token, 
			 				   			 String app_token,
			 				   			 Integer idCobranca){
		
		return "200";
	}
	
	/**
	 * 
	 * @param access_token
	 * Token que identifica o usuario da API.
	 * 
	 * @param app_token
	 * Token que identifica a Aplicação que está utilizando recursos da API.
	 * 
	 * @param idSacado
	 * Identificador do cliente
	 * 
	 * @param idProduct
	 * Identificador do serviço ou produto,[0][idProduto]
	 * 
	 * @param qtdadeProduct
	 * Qtdade de produto ou serviço,[0][qtdadeComp]
	 * 
	 * @param valueUnitary
	 * Valor unitário do produto,[0][valorUnitarioProduto]
	 * 
	 * @param valueTotal
	 * Valor total da cobrança
	 * 
	 * @param dateMaturity
	 * Vencimento (Data deve estar no padrão MM/DD/YYYY)
	 * 
	 * @param idFormPayment
	 * Forma de pagamento
	 * 
	 * @param noteInternal
	 * Observação interna
	 * 
	 * @param noteClient
	 * Observação para o cliente
	 * 
	 * @param accountBank
	 * Conta bancária
	 * 
	 * @param valuePortion
	 * Valor da parcela
	 * 
	 * @param maturityPortion
	 * Vencimento da parcela (Data deve estar no padrão MM/DD/YYYY)
	 * 
	 * @param notePortion
	 * Observação da Parcela
	 * 
	 * @param formPayment
	 *  Se a forma de pagamento for boleto, 
	 *  e se ele já foi enviado para o cliente informe-o aqui.
	 * 
	 * @return
	 */
	public String CollectionRegister(String access_token, 
			   						 String app_token,
			   						 Integer idSacado,
			   						 Integer idProduct[][],
			   						 Integer qtdadeProduct[][],
			   						 Double valueUnitary[][],
			   						 Double valueTotal,
			   						 Date dateMaturity,
			   						 Date idFormPayment,
			   						 String noteInternal,
			   						 String noteClient,
			   						 Integer accountBank,
			   						 Double valuePortion,
			   						 Date maturityPortion,
			   						 String notePortion,
			   						 String formPayment){
		
		return "200";
	}
}