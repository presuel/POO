// IllegalArgumentException y UnsupportedOperationException pertenecen a un grupo de excepciones que 
// son clases derivadas de RuntimeException, la cual es de tipo unchecked y por lo tanto no requiere
// declararse el método explícitamente con throws Exception (aunque si se puede forzar), a diferencia 
// de excepciones que heredan sólo de exception, que al ser consideradas de tipo checked si deben ser 
// declarado explícitamente el método.

public class triangulo extends figura implements poligono {
    // Atributos
    protected double base;
    protected double altura;
    protected boolean esRectangulo;

    // Constructores
    public triangulo() {
        super(3);
        this.base = 0;
        this.altura = 0;
    }

    public triangulo(double base, double altura) {
        super(3);
        this.base = this.altura = 0;
        if (base > 0 && altura > 0) {
            this.base = base;
            this.altura = altura;
        } else {
            // Excepción: Altura y Base no pueden ser menor o igual a cero.
            throw new IllegalArgumentException("Triangulo con medidas irreales, no pueden ser menor o igual a cero.");
        }
    }

    public triangulo(double base, double altura, boolean esRectangulo) {
        super(3);
        this.esRectangulo = esRectangulo;
        this.base = this.altura = 0;
        if (base > 0 && altura > 0) {
            this.base = base;
            this.altura = altura;
        } else {
            // Excepción: Altura y Base no pueden ser menor o igual a cero.
            throw new IllegalArgumentException("Triangulo con medidas irreales, no pueden ser menor o igual a cero.");
        }
    }

    // Setters & Getters

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {// throws Exception {
        if (base > 0)
            this.base = base;
        else
            throw new IllegalArgumentException("La base de un triangulo no puede ser menor o igual a cero.");
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {// throws Exception {
        if (altura > 0)
            this.altura = altura;
        else
            throw new IllegalArgumentException("La altura de un triangulo no puede ser menor o igual a cero.");
    }

    public boolean isRectangulo() {
        return this.esRectangulo;
    }

    public void setEsRectangulo(boolean esRectangulo) {
        this.esRectangulo = esRectangulo;
    }

    public double Area() {
        return this.base * this.altura / 2;
    }

    public double Perimetro() {
        throw new UnsupportedOperationException("\nError al invocar Perimetro(): Se desconoce la medida de los lados.");
    }

}

/*
 * ---------------- Jerarquía de la CLASE THROWABLE -----------
 * Throwable
 * Error
 * AWTError
 * LinkageError
 * ClassCircularityError
 * ClassFormatError
 * ExceptionInInitializerError
 * IncompatibleClassChangeError
 * NoClassDefFoundError
 * UnsatisfiedLinkError
 * VerifyError
 * ThreadDeath
 * VirtualMachineError
 * InternalError
 * OutOfMemoryError
 * StackOverflowError
 * UnknownError
 * Exception
 * AclNotFoundException
 * ActivationException
 * UnknownGroupException
 * UnknownObjectException
 * AlreadyBoundException
 * ApplicationException
 * AWTException
 * BadLocationException
 * ClassNotFoundException
 * CloneNotSupportedException
 * ServerCloneException
 * DataFormatException
 * ExpandVetoException
 * FontFormatException
 * GeneralSecurityException
 * CertificateException
 * CRLException
 * DigestException
 * InvalidAlgorithmParameterException
 * InvalidKeySpecException
 * InvalidParameterSpecException
 * KeyException
 * KeyStoreException
 * NoSuchAlgorithmException
 * NoSuchProviderException
 * SignatureException
 * UnrecoverableKeyException
 * IllegalAccessException
 * InstantiationException
 * IntrospectionException
 * InvalidMidiDataException
 * InvocationTargetException
 * IOException
 * ChangedCharSetException
 * CharConversionException
 * EOFException
 * FileNotFoundException
 * InterruptedIOException
 * MalformedURLException
 * ObjectStreamException
 * ProtocolException
 * RemoteException
 * SocketException
 * SyncFailedException
 * UnknownHostException
 * UnknownServiceException
 * UnsupportedEncodingException
 * UTFDataFormatException
 * ZipExcept
 * LastOwnerException
 * LineUnavailableException
 * MidiUnavailableException
 * MimeTypeParseException
 * NamingException
 * AttributeInUseException
 * AttributeModificationException
 * CannotProceedException
 * CommunicationException
 * ConfigurationException
 * ContextNotEmptyException
 * InsufficientResourcesException
 * InterruptedNamingException
 * InvalidAttributeIdentifierException
 * InvalidAttributesException
 * InvalidAttributeValueException
 * InvalidNameException
 * InvalidSearchControlsException
 * InvalidSearchFilterException
 * LimitExceededException
 * LinkException
 * NameAlreadyBoundException
 * NameNotFoundException
 * NamingSecurityException
 * NoInitialContextException
 * NoSuchAttributeException
 * NotContextException
 * OperationNotSupportedException
 * ReferralException
 * SchemaViolationException
 * ServiceUnavailableException
 * NoninvertibleTransformException
 * NoSuchFieldException
 * NoSuchMethodException
 * NotBoundException
 * NotOwnerException
 * ParseException
 * PartialResultException
 * PrinterException
 * PrinterAbortException
 * PrinterIOException
 * PrivilegedActionException
 * RemarshalException
 * RuntimeException
 * ArithmeticException
 * ArrayStoreException
 * CannotRedoException
 * CannotUndoException
 * ClassCastException
 * CMMException
 * ConcurrentModificationException
 * EmptyStackException
 * IllegalArgumentException
 * IllegalParameterException
 * IllegalThreadStateException
 * NumberFormatException
 * IllegalMonitorStateException
 * IllegalPathStateException
 * IllegalStateException
 * ImagingOpException
 * IndexOutOfBoundsException
 * MissingResourceException
 * NegativeArraySizeException
 * NoSuchElementException
 * NullPointerException
 * ProfileDataException
 * ProviderException
 * RasterFormatException
 * SecurityException
 * SystemException
 * UndeclaredThrowableException
 * UnsupportedOperationException
 * SQLException
 * BatchUpdateException
 * SQLWarning
 * TooManyListenersException
 * UnsupportedAudioFileException
 * UnsupportedFlavorException
 * UnsupportedLookAndFeelException
 * UserException
 * AlreadyBound
 * BadKind
 * Bounds
 * Bounds
 * CannotProceed
 * InconsistentTypeCode
 * Invalid
 * InvalidName
 * InvalidName
 * InvalidSeq
 * InvalidValue
 * NotEmpty
 * NotFound
 * PolicyError
 * TypeMismatch
 * UnknownUserException
 * WrongTransaction
 */