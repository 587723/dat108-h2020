package b3_immutable;

public class MeldingImmutable {
	
	private String innhold;

	public MeldingImmutable(String innhold) {
		this.innhold = innhold;
	}

	public String getInnhold() {
		return innhold;
	}

	public MeldingImmutable lagtTil(String merTekst) {
		return new MeldingImmutable(innhold += merTekst);
	}
	
	@Override
	public String toString() {
		return "MeldingImmutable [innhold=" + innhold + "]";
	}
	
}
