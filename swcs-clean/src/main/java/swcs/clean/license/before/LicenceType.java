package swcs.clean.license.before;

import java.util.Objects;

record LicenceType(String type) {

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LicenceType that = (LicenceType) o;
        return Objects.equals(this.type, that.type);
    }

}
