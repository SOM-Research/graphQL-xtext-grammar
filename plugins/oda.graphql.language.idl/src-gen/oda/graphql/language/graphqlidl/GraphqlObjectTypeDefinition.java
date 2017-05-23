/**
 * generated by Xtext 2.10.0
 */
package oda.graphql.language.graphqlidl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphql Object Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oda.graphql.language.graphqlidl.GraphqlObjectTypeDefinition#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link oda.graphql.language.graphqlidl.GraphqlObjectTypeDefinition#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see oda.graphql.language.graphqlidl.GraphqlidlPackage#getGraphqlObjectTypeDefinition()
 * @model
 * @generated
 */
public interface GraphqlObjectTypeDefinition extends GraphqlTypeDefinition
{
  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
   * The list contents are of type {@link oda.graphql.language.graphqlidl.GraphqlInterfaceTypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' reference list.
   * @see oda.graphql.language.graphqlidl.GraphqlidlPackage#getGraphqlObjectTypeDefinition_Interfaces()
   * @model
   * @generated
   */
  EList<GraphqlInterfaceTypeDefinition> getInterfaces();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link oda.graphql.language.graphqlidl.GraphqlField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see oda.graphql.language.graphqlidl.GraphqlidlPackage#getGraphqlObjectTypeDefinition_Fields()
   * @model containment="true"
   * @generated
   */
  EList<GraphqlField> getFields();

} // GraphqlObjectTypeDefinition
