package com.prabhjotsingh.shyftlabs.controller

import graphql.GraphQLError
import graphql.GraphqlErrorBuilder
import graphql.schema.DataFetchingEnvironment
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter
import org.springframework.graphql.execution.ErrorType
import org.springframework.stereotype.Component

@Component
class ExceptionHandler : DataFetcherExceptionResolverAdapter() {
    override fun resolveToSingleError(ex: Throwable, env: DataFetchingEnvironment): GraphQLError {
        var type: ErrorType? = null
        type = if (ex is DataIntegrityViolationException) {
            ErrorType.BAD_REQUEST
        } else {
            ErrorType.INTERNAL_ERROR
        }
        return GraphqlErrorBuilder.newError(env)
            .message("Received Message: " + ex.message)
            .errorType(type)
            .build()
    }
}
