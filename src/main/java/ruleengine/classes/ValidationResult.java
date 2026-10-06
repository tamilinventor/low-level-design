package ruleengine.classes;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidationResult {

    private boolean isValid;
    private String breachedRule;
    private String reason;

    public static ValidationResult valid() {
        return new ValidationResult(true, null, null);
    }

    public static ValidationResult failed(String reason, String rule) {
        return new ValidationResult(false, rule, reason);
    }

}
