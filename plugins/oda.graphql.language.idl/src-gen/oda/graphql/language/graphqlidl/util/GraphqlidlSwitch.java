/**
 * generated by Xtext 2.10.0
 */
package oda.graphql.language.graphqlidl.util;

import oda.graphql.language.graphqlidl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see oda.graphql.language.graphqlidl.GraphqlidlPackage
 * @generated
 */
public class GraphqlidlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GraphqlidlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphqlidlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GraphqlidlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GraphqlidlPackage.GRAPHQL_SCHEMA:
      {
        GraphqlSchema graphqlSchema = (GraphqlSchema)theEObject;
        T result = caseGraphqlSchema(graphqlSchema);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_SCHEMA_DEFINITION:
      {
        GraphqlSchemaDefinition graphqlSchemaDefinition = (GraphqlSchemaDefinition)theEObject;
        T result = caseGraphqlSchemaDefinition(graphqlSchemaDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_ROOT_QUERY:
      {
        GraphqlRootQuery graphqlRootQuery = (GraphqlRootQuery)theEObject;
        T result = caseGraphqlRootQuery(graphqlRootQuery);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_TYPE_DEFINITION:
      {
        GraphqlTypeDefinition graphqlTypeDefinition = (GraphqlTypeDefinition)theEObject;
        T result = caseGraphqlTypeDefinition(graphqlTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_OBJECT_TYPE_DEFINITION:
      {
        GraphqlObjectTypeDefinition graphqlObjectTypeDefinition = (GraphqlObjectTypeDefinition)theEObject;
        T result = caseGraphqlObjectTypeDefinition(graphqlObjectTypeDefinition);
        if (result == null) result = caseGraphqlTypeDefinition(graphqlObjectTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_INTERFACE_TYPE_DEFINITION:
      {
        GraphqlInterfaceTypeDefinition graphqlInterfaceTypeDefinition = (GraphqlInterfaceTypeDefinition)theEObject;
        T result = caseGraphqlInterfaceTypeDefinition(graphqlInterfaceTypeDefinition);
        if (result == null) result = caseGraphqlTypeDefinition(graphqlInterfaceTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_SCALAR_TYPE_DEFINITION:
      {
        GraphqlScalarTypeDefinition graphqlScalarTypeDefinition = (GraphqlScalarTypeDefinition)theEObject;
        T result = caseGraphqlScalarTypeDefinition(graphqlScalarTypeDefinition);
        if (result == null) result = caseGraphqlTypeDefinition(graphqlScalarTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_EMUN_TYPE_DEFINITION:
      {
        GraphqlEmunTypeDefinition graphqlEmunTypeDefinition = (GraphqlEmunTypeDefinition)theEObject;
        T result = caseGraphqlEmunTypeDefinition(graphqlEmunTypeDefinition);
        if (result == null) result = caseGraphqlTypeDefinition(graphqlEmunTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_UNION_TYPE_DEFINITION:
      {
        GraphqlUnionTypeDefinition graphqlUnionTypeDefinition = (GraphqlUnionTypeDefinition)theEObject;
        T result = caseGraphqlUnionTypeDefinition(graphqlUnionTypeDefinition);
        if (result == null) result = caseGraphqlTypeDefinition(graphqlUnionTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_INPUT_TYPE_DEFINITION:
      {
        GraphqlInputTypeDefinition graphqlInputTypeDefinition = (GraphqlInputTypeDefinition)theEObject;
        T result = caseGraphqlInputTypeDefinition(graphqlInputTypeDefinition);
        if (result == null) result = caseGraphqlTypeDefinition(graphqlInputTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_INPUT_FIELD:
      {
        GraphqlInputField graphqlInputField = (GraphqlInputField)theEObject;
        T result = caseGraphqlInputField(graphqlInputField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_FIELD:
      {
        GraphqlField graphqlField = (GraphqlField)theEObject;
        T result = caseGraphqlField(graphqlField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_TYPE:
      {
        GraphqlType graphqlType = (GraphqlType)theEObject;
        T result = caseGraphqlType(graphqlType);
        if (result == null) result = caseGraphqlListType(graphqlType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_NAMED_TYPE:
      {
        GraphqlNamedType graphqlNamedType = (GraphqlNamedType)theEObject;
        T result = caseGraphqlNamedType(graphqlNamedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_LIST_TYPE:
      {
        GraphqlListType graphqlListType = (GraphqlListType)theEObject;
        T result = caseGraphqlListType(graphqlListType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_INPUT_TYPE:
      {
        GraphqlInputType graphqlInputType = (GraphqlInputType)theEObject;
        T result = caseGraphqlInputType(graphqlInputType);
        if (result == null) result = caseGraphqlListInputType(graphqlInputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_LIST_INPUT_TYPE:
      {
        GraphqlListInputType graphqlListInputType = (GraphqlListInputType)theEObject;
        T result = caseGraphqlListInputType(graphqlListInputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.GRAPHQL_VALUE:
      {
        GraphqlValue graphqlValue = (GraphqlValue)theEObject;
        T result = caseGraphqlValue(graphqlValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.SINGLE_VALUE:
      {
        SingleValue singleValue = (SingleValue)theEObject;
        T result = caseSingleValue(singleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.COMPLEX_VALUE:
      {
        ComplexValue complexValue = (ComplexValue)theEObject;
        T result = caseComplexValue(complexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.ENUM_VALUE:
      {
        EnumValue enumValue = (EnumValue)theEObject;
        T result = caseEnumValue(enumValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.LIST_VALUE:
      {
        ListValue listValue = (ListValue)theEObject;
        T result = caseListValue(listValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.OBJECT_VALUE:
      {
        ObjectValue objectValue = (ObjectValue)theEObject;
        T result = caseObjectValue(objectValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GraphqlidlPackage.OBJECT_FIELD:
      {
        ObjectField objectField = (ObjectField)theEObject;
        T result = caseObjectField(objectField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Schema</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Schema</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlSchema(GraphqlSchema object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Schema Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Schema Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlSchemaDefinition(GraphqlSchemaDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Root Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Root Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlRootQuery(GraphqlRootQuery object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlTypeDefinition(GraphqlTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Object Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Object Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlObjectTypeDefinition(GraphqlObjectTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Interface Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Interface Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlInterfaceTypeDefinition(GraphqlInterfaceTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Scalar Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Scalar Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlScalarTypeDefinition(GraphqlScalarTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Emun Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Emun Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlEmunTypeDefinition(GraphqlEmunTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Union Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Union Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlUnionTypeDefinition(GraphqlUnionTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Input Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Input Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlInputTypeDefinition(GraphqlInputTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Input Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Input Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlInputField(GraphqlInputField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlField(GraphqlField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlType(GraphqlType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Named Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Named Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlNamedType(GraphqlNamedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql List Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql List Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlListType(GraphqlListType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Input Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Input Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlInputType(GraphqlInputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql List Input Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql List Input Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlListInputType(GraphqlListInputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graphql Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graphql Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraphqlValue(GraphqlValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleValue(SingleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexValue(ComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumValue(EnumValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListValue(ListValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectValue(ObjectValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectField(ObjectField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GraphqlidlSwitch