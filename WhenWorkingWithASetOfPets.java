package serenitylabs.tutorials.vetclinic.collections.exercises;

import com.google.common.collect.Sets;
import com.google.common.primitives.Booleans;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;

public class WhenWorkingWithASetOfPets {

    @Test
    public void should_add_Fido_to_the_set_of_pets() {
        Set<String> names = Sets.newHashSet();

        names.add("Fido");
        assertThat(Boolean.TRUE, equalTo(names.contains("Fido")));
    }

    @Test
    public void a_set_of_pets_should_not_contain_duplicates() {
        Set<String> names = Sets.newHashSet();

        names.add("Fido");
        names.add("Felix");
        names.add("Fido");

        ArrayList<String> unique = new ArrayList<>(names);

        for(int i=1; i<unique.size();i++){
            Assert.assertNotEquals(unique.get(i-1), unique.get(i));
    }}

    @Test
    public void adding_several_pets() {
        Set<String> names = Sets.newHashSet("Fido", "Felix");

        names.addAll(Sets.newHashSet("Felix", "Spot"));

        assertThat(names, hasItems("Fido", "Felix", "Spot"));
    }


}
