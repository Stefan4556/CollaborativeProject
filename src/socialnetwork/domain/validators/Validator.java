package socialnetwork.domain.validators;

import socialnetwork.domain.validators.ValidationException;

/**
 * Validator interface.
 * @param <T> the type of entity that the validator is for
 */
public interface Validator<T>
{
    /**
     * Validates the given entity.
     * @param entity the entity that needs to be validated
     * @throws ValidationException if the given entity is not valid
     */
    void validate(T entity) throws ValidationException;
}