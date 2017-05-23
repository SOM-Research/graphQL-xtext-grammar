/**
 * generated by Xtext 2.10.0
 */
package oda.graphql.language.graphqlidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphql Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oda.graphql.language.graphqlidl.GraphqlInputType#getDtype <em>Dtype</em>}</li>
 *   <li>{@link oda.graphql.language.graphqlidl.GraphqlInputType#isNonNull <em>Non Null</em>}</li>
 *   <li>{@link oda.graphql.language.graphqlidl.GraphqlInputType#getNtype <em>Ntype</em>}</li>
 *   <li>{@link oda.graphql.language.graphqlidl.GraphqlInputType#getLtype <em>Ltype</em>}</li>
 * </ul>
 *
 * @see oda.graphql.language.graphqlidl.GraphqlidlPackage#getGraphqlInputType()
 * @model
 * @generated
 */
public interface GraphqlInputType extends GraphqlListInputType
{
  /**
   * Returns the value of the '<em><b>Dtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dtype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dtype</em>' reference.
   * @see #setDtype(GraphqlInputTypeDefinition)
   * @see oda.graphql.language.graphqlidl.GraphqlidlPackage#getGraphqlInputType_Dtype()
   * @model
   * @generated
   */
  GraphqlInputTypeDefinition getDtype();

  /**
   * Sets the value of the '{@link oda.graphql.language.graphqlidl.GraphqlInputType#getDtype <em>Dtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dtype</em>' reference.
   * @see #getDtype()
   * @generated
   */
  void setDtype(GraphqlInputTypeDefinition value);

  /**
   * Returns the value of the '<em><b>Non Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Non Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Non Null</em>' attribute.
   * @see #setNonNull(boolean)
   * @see oda.graphql.language.graphqlidl.GraphqlidlPackage#getGraphqlInputType_NonNull()
   * @model
   * @generated
   */
  boolean isNonNull();

  /**
   * Sets the value of the '{@link oda.graphql.language.graphqlidl.GraphqlInputType#isNonNull <em>Non Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Non Null</em>' attribute.
   * @see #isNonNull()
   * @generated
   */
  void setNonNull(boolean value);

  /**
   * Returns the value of the '<em><b>Ntype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ntype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ntype</em>' containment reference.
   * @see #setNtype(GraphqlNamedType)
   * @see oda.graphql.language.graphqlidl.GraphqlidlPackage#getGraphqlInputType_Ntype()
   * @model containment="true"
   * @generated
   */
  GraphqlNamedType getNtype();

  /**
   * Sets the value of the '{@link oda.graphql.language.graphqlidl.GraphqlInputType#getNtype <em>Ntype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ntype</em>' containment reference.
   * @see #getNtype()
   * @generated
   */
  void setNtype(GraphqlNamedType value);

  /**
   * Returns the value of the '<em><b>Ltype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ltype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ltype</em>' containment reference.
   * @see #setLtype(GraphqlListInputType)
   * @see oda.graphql.language.graphqlidl.GraphqlidlPackage#getGraphqlInputType_Ltype()
   * @model containment="true"
   * @generated
   */
  GraphqlListInputType getLtype();

  /**
   * Sets the value of the '{@link oda.graphql.language.graphqlidl.GraphqlInputType#getLtype <em>Ltype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ltype</em>' containment reference.
   * @see #getLtype()
   * @generated
   */
  void setLtype(GraphqlListInputType value);

} // GraphqlInputType
