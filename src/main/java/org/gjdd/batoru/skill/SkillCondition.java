package org.gjdd.batoru.skill;

import org.gjdd.batoru.skill.builder.SkillConditionBuilder;

/**
 * 스킬의 조건을 정의하는 인터페이스입니다.
 */
public interface SkillCondition {

    /**
     * 이 인터페이스의 빌더 객체를 생성하여 반환합니다.
     *
     * @return 빌더 객체
     */
    static SkillConditionBuilder builder() {
        return new SkillConditionBuilder();
    }

    /**
     * 쿨다운을 무시할지 여부를 반환합니다.
     *
     * @param context 스킬 컨텍스트
     * @return 쿨다운 무시 여부
     */
    default boolean ignoreCooldown(SkillContext context) {
        return false;
    }

    /**
     * 정신 집중을 무시할지 여부를 반환합니다.
     *
     * @param context 스킬 컨텍스트
     * @return 정신 집중 무시 여부
     */
    default boolean ignoreChanneling(SkillContext context) {
        return false;
    }

    /**
     * 침묵 상태를 무시할지 여부를 반환합니다.
     *
     * @param context 스킬 컨텍스트
     * @return 침묵 상태 무시 여부
     */
    default boolean ignoreSilenced(SkillContext context) {
        return false;
    }

    /**
     * 스킬을 사용할 수 있는지 여부를 반환합니다.
     *
     * @param context 스킬 컨텍스트
     * @return 스킬 사용 가능 여부
     */
    SkillActionResult canUse(SkillContext context);
}
