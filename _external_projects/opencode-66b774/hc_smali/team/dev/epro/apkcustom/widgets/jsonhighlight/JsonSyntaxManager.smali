.class public Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final PATTERN_BOOLEAN:Ljava/util/regex/Pattern;

.field private static final PATTERN_NULL:Ljava/util/regex/Pattern;

.field private static final PATTERN_NUMBER:Ljava/util/regex/Pattern;

.field private static final PATTERN_OPERATOR:Ljava/util/regex/Pattern;

.field private static final PATTERN_PROPERTY:Ljava/util/regex/Pattern;

.field private static final PATTERN_PUNCTUATION:Ljava/util/regex/Pattern;

.field private static final PATTERN_STRING:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-string v0, "\".*\"(?=.*:)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_PROPERTY:Ljava/util/regex/Pattern;

    const-string v0, "\".*\"(?!.*:)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_STRING:Ljava/util/regex/Pattern;

    const-string v0, "[0-9](?!.*\")"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_NUMBER:Ljava/util/regex/Pattern;

    const-string v0, "[{}\\[\\]);,]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_PUNCTUATION:Ljava/util/regex/Pattern;

    const-string v0, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_OPERATOR:Ljava/util/regex/Pattern;

    const-string v0, "H1:M3m\u001d`iN1<I`m\u001c6m\u001ajfI3>J7>Nal\u001db"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_BOOLEAN:Ljava/util/regex/Pattern;

    const-string v0, "H1m@c:KggLe9KkfAgj\u00196oI1oHb=\u001a6iJa"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_NULL:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static applyTheme(Landroid/content/Context;Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V
    .registers 6

    invoke-virtual {p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->resetSyntaxPatternList()V

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_PROPERTY:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600bb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->addSyntaxPattern(Ljava/util/regex/Pattern;I)V

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_STRING:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600b7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->addSyntaxPattern(Ljava/util/regex/Pattern;I)V

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_NUMBER:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600b9

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->addSyntaxPattern(Ljava/util/regex/Pattern;I)V

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_PUNCTUATION:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600ba

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->addSyntaxPattern(Ljava/util/regex/Pattern;I)V

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_OPERATOR:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f06004c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->addSyntaxPattern(Ljava/util/regex/Pattern;I)V

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_NULL:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0600b8

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->addSyntaxPattern(Ljava/util/regex/Pattern;I)V

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/JsonSyntaxManager;->PATTERN_BOOLEAN:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0600f1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->addSyntaxPattern(Ljava/util/regex/Pattern;I)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/widget/MultiAutoCompleteTextView;->setTextColor(I)V

    invoke-virtual {p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->reHighlightSyntax()V

    return-void
.end method
