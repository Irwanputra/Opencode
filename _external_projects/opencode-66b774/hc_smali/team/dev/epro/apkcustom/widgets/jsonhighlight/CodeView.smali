.class public Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;
.super Landroidx/appcompat/widget/AppCompatMultiAutoCompleteTextView;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$TabWidthSpan;
    }
.end annotation


# static fields
.field private static final PATTERN_LINE:Ljava/util/regex/Pattern;

.field private static final PATTERN_TRAILING_WHITE_SPACE:Ljava/util/regex/Pattern;

.field private static final TAG:Ljava/lang/String; = "CodeView"


# instance fields
.field public LINE_NUMBER_TEXTSIZE_GAP:I

.field private _rect:Landroid/graphics/Rect;

.field private dirty:Z

.field private final displayDensity:F

.field private hasErrors:Z

.field private lineNumberMarginGap:I

.field private lineNumberVisible:Z

.field private lpaint:Landroid/graphics/Paint;

.field private mAutoCompleteTokenizer:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

.field private final mEditorTextWatcher:Landroid/text/TextWatcher;

.field private final mErrorHashSet:Ljava/util/SortedMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/SortedMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mIndentCharacterList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field private mRemoveErrorsWhenTextChanged:Z

.field private final mSyntaxPatternMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/regex/Pattern;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mUpdateDelayTime:I

.field private final mUpdateHandler:Landroid/os/Handler;

.field private final mUpdateRunnable:Ljava/lang/Runnable;

.field private modified:Z

.field private tabWidth:I

.field private tabWidthInCharacters:I


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const-string v0, "\u00197:Ngm\u001c4<\u00191fAff\u001b7m\u001bd=\u001a4jJkgO`oN`"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->PATTERN_LINE:Ljava/util/regex/Pattern;

    const-string v0, "[\\t ]+$"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->PATTERN_TRAILING_WHITE_SPACE:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 6

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatMultiAutoCompleteTextView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberVisible:Z

    const/4 v0, 0x2

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberMarginGap:I

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->LINE_NUMBER_TEXTSIZE_GAP:I

    const/16 v1, 0x1f4

    iput v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateDelayTime:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->modified:Z

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateHandler:Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    iput v2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->displayDensity:F

    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    iput-object v2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Character;

    const/16 v3, 0x7b

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    aput-object v3, v2, p1

    const/16 p1, 0x2b

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    aput-object p1, v2, v1

    const/16 p1, 0x2d

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    aput-object p1, v2, v0

    const/16 p1, 0x2a

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    const/4 v0, 0x3

    aput-object p1, v2, v0

    const/16 p1, 0x2f

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    const/4 v0, 0x4

    aput-object p1, v2, v0

    const/16 p1, 0x3d

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    const/4 v0, 0x5

    aput-object p1, v2, v0

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mIndentCharacterList:Ljava/util/List;

    new-instance p1, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$2;

    invoke-direct {p1, p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$2;-><init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateRunnable:Ljava/lang/Runnable;

    new-instance p1, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;

    invoke-direct {p1, p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;-><init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mEditorTextWatcher:Landroid/text/TextWatcher;

    invoke-direct {p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->initEditorView()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 6

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatMultiAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberVisible:Z

    const/4 p2, 0x2

    iput p2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberMarginGap:I

    iput p2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->LINE_NUMBER_TEXTSIZE_GAP:I

    const/16 v0, 0x1f4

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateDelayTime:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->modified:Z

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateHandler:Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->displayDensity:F

    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Character;

    const/16 v2, 0x7b

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    aput-object v2, v1, p1

    const/16 p1, 0x2b

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    aput-object p1, v1, v0

    const/16 p1, 0x2d

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    aput-object p1, v1, p2

    const/16 p1, 0x2a

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v1, p2

    const/16 p1, 0x2f

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v1, p2

    const/16 p1, 0x3d

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    const/4 p2, 0x5

    aput-object p1, v1, p2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mIndentCharacterList:Ljava/util/List;

    new-instance p1, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$2;

    invoke-direct {p1, p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$2;-><init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateRunnable:Ljava/lang/Runnable;

    new-instance p1, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;

    invoke-direct {p1, p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;-><init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mEditorTextWatcher:Landroid/text/TextWatcher;

    invoke-direct {p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->initEditorView()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 6

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatMultiAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberVisible:Z

    const/4 p2, 0x2

    iput p2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberMarginGap:I

    iput p2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->LINE_NUMBER_TEXTSIZE_GAP:I

    const/16 p3, 0x1f4

    iput p3, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateDelayTime:I

    const/4 p3, 0x1

    iput-boolean p3, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->modified:Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateHandler:Landroid/os/Handler;

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->displayDensity:F

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Character;

    const/16 v1, 0x7b

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    aput-object v1, v0, p1

    const/16 p1, 0x2b

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    aput-object p1, v0, p3

    const/16 p1, 0x2d

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    aput-object p1, v0, p2

    const/16 p1, 0x2a

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, v0, p2

    const/16 p1, 0x2f

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, v0, p2

    const/16 p1, 0x3d

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    const/4 p2, 0x5

    aput-object p1, v0, p2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mIndentCharacterList:Ljava/util/List;

    new-instance p1, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$2;

    invoke-direct {p1, p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$2;-><init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateRunnable:Ljava/lang/Runnable;

    new-instance p1, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;

    invoke-direct {p1, p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$3;-><init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mEditorTextWatcher:Landroid/text/TextWatcher;

    invoke-direct {p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->initEditorView()V

    return-void
.end method

.method public static synthetic access$000(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)Z
    .registers 1

    iget-boolean p0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->modified:Z

    return p0
.end method

.method public static synthetic access$100(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;Ljava/lang/CharSequence;Landroid/text/Spanned;II)Ljava/lang/CharSequence;
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->autoIndent(Ljava/lang/CharSequence;Landroid/text/Spanned;II)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$1000(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)I
    .registers 1

    iget p0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->tabWidth:I

    return p0
.end method

.method public static synthetic access$300(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;Landroid/text/Editable;)V
    .registers 2

    invoke-direct {p0, p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->highlightWithoutChange(Landroid/text/Editable;)V

    return-void
.end method

.method public static synthetic access$400(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;Landroid/text/Editable;II)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->convertTabs(Landroid/text/Editable;II)V

    return-void
.end method

.method public static synthetic access$502(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;Z)Z
    .registers 2

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->dirty:Z

    return p1
.end method

.method public static synthetic access$600(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)Ljava/lang/Runnable;
    .registers 1

    iget-object p0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static synthetic access$700(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)I
    .registers 1

    iget p0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateDelayTime:I

    return p0
.end method

.method public static synthetic access$800(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)Landroid/os/Handler;
    .registers 1

    iget-object p0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic access$900(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)Z
    .registers 1

    iget-boolean p0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mRemoveErrorsWhenTextChanged:Z

    return p0
.end method

.method private autoIndent(Ljava/lang/CharSequence;Landroid/text/Spanned;II)Ljava/lang/CharSequence;
    .registers 14

    add-int/lit8 v0, p3, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_4
    const/16 v3, 0x9

    const/16 v4, 0x20

    const/16 v5, 0xa

    const/4 v6, -0x1

    if-le v0, v6, :cond_39

    invoke-interface {p2, v0}, Landroid/text/Spanned;->charAt(I)C

    move-result v7

    if-ne v7, v5, :cond_14

    goto :goto_39

    :cond_14
    if-eq v7, v4, :cond_36

    if-eq v7, v3, :cond_36

    if-nez v2, :cond_29

    iget-object v2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mIndentCharacterList:Ljava/util/List;

    invoke-static {v7}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    add-int/lit8 v1, v1, -0x1

    :cond_28
    const/4 v2, 0x1

    :cond_29
    const/16 v3, 0x28

    if-ne v7, v3, :cond_30

    add-int/lit8 v1, v1, -0x1

    goto :goto_36

    :cond_30
    const/16 v3, 0x29

    if-ne v7, v3, :cond_36

    add-int/lit8 v1, v1, 0x1

    :cond_36
    :goto_36
    add-int/lit8 v0, v0, -0x1

    goto :goto_4

    :cond_39
    :goto_39
    const-string v2, ""

    if-le v0, v6, :cond_74

    invoke-interface {p2, p3}, Landroid/text/Spanned;->charAt(I)C

    move-result p3

    add-int/lit8 v0, v0, 0x1

    move v6, v0

    :goto_44
    if-ge v6, p4, :cond_65

    invoke-interface {p2, v6}, Landroid/text/Spanned;->charAt(I)C

    move-result v7

    if-eq p3, v5, :cond_5d

    const/16 v8, 0x2f

    if-ne v7, v8, :cond_5d

    add-int/lit8 v8, v6, 0x1

    if-ge v8, p4, :cond_5d

    invoke-interface {p2, v6}, Landroid/text/Spanned;->charAt(I)C

    move-result v8

    if-ne v8, v7, :cond_5d

    add-int/lit8 v6, v6, 0x2

    goto :goto_65

    :cond_5d
    if-eq v7, v4, :cond_62

    if-eq v7, v3, :cond_62

    goto :goto_65

    :cond_62
    add-int/lit8 v6, v6, 0x1

    goto :goto_44

    :cond_65
    :goto_65
    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-interface {p2, v0, v6}, Landroid/text/Spanned;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_74
    if-gez v1, :cond_7c

    const-string p2, "\t"

    invoke-static {v2, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_7c
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private clearSpans(Landroid/text/Editable;)V
    .registers 7

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    const-class v1, Landroid/text/style/ForegroundColorSpan;

    const/4 v2, 0x0

    invoke-interface {p1, v2, v0, v1}, Landroid/text/Editable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/text/style/ForegroundColorSpan;

    array-length v3, v1

    :goto_e
    add-int/lit8 v4, v3, -0x1

    if-lez v3, :cond_19

    aget-object v3, v1, v4

    invoke-interface {p1, v3}, Landroid/text/Editable;->removeSpan(Ljava/lang/Object;)V

    move v3, v4

    goto :goto_e

    :cond_19
    const-class v1, Landroid/text/style/BackgroundColorSpan;

    invoke-interface {p1, v2, v0, v1}, Landroid/text/Editable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/text/style/BackgroundColorSpan;

    array-length v1, v0

    :goto_22
    add-int/lit8 v2, v1, -0x1

    if-lez v1, :cond_2d

    aget-object v1, v0, v2

    invoke-interface {p1, v1}, Landroid/text/Editable;->removeSpan(Ljava/lang/Object;)V

    move v1, v2

    goto :goto_22

    :cond_2d
    return-void
.end method

.method private convertTabs(Landroid/text/Editable;II)V
    .registers 8

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->tabWidth:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_6

    return-void

    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/2addr p3, p2

    :goto_b
    const-string v1, "\t"

    invoke-virtual {v0, v1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result p2

    const/4 v1, -0x1

    if-le p2, v1, :cond_25

    if-ge p2, p3, :cond_25

    new-instance v1, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$TabWidthSpan;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$TabWidthSpan;-><init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$1;)V

    add-int/lit8 v2, p2, 0x1

    const/16 v3, 0x21

    invoke-interface {p1, v1, p2, v2, v3}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    move p2, v2

    goto :goto_b

    :cond_25
    return-void
.end method

.method private createBackgroundColorSpan(Landroid/text/Editable;Ljava/util/regex/Matcher;I)V
    .registers 6

    new-instance v0, Landroid/text/style/BackgroundColorSpan;

    invoke-direct {v0, p3}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->start()I

    move-result p3

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->end()I

    move-result p2

    const/16 v1, 0x21

    invoke-interface {p1, v0, p3, p2, v1}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method private createForegroundColorSpan(Landroid/text/Editable;Ljava/util/regex/Matcher;I)V
    .registers 6

    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->start()I

    move-result p3

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->end()I

    move-result p2

    const/16 v1, 0x21

    invoke-interface {p1, v0, p3, p2, v1}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method private highlight(Landroid/text/Editable;)Landroid/text/Editable;
    .registers 3

    :try_start_0
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_7

    return-object p1

    :cond_7
    invoke-direct {p0, p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->clearSpans(Landroid/text/Editable;)V

    invoke-direct {p0, p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->highlightErrorLines(Landroid/text/Editable;)V

    invoke-direct {p0, p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->highlightSyntax(Landroid/text/Editable;)V
    :try_end_10
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_10} :catch_11

    goto :goto_15

    :catch_11
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    :goto_15
    return-object p1
.end method

.method private highlightErrorLines(Landroid/text/Editable;)V
    .registers 7

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    invoke-interface {v0}, Ljava/util/SortedMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    return-void

    :cond_9
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    invoke-interface {v0}, Ljava/util/SortedMap;->lastKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    sget-object v2, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->PATTERN_LINE:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    :cond_1c
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_45

    iget-object v3, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/SortedMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_41

    iget-object v3, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/SortedMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {p0, p1, v2, v3}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->createBackgroundColorSpan(Landroid/text/Editable;Ljava/util/regex/Matcher;I)V

    :cond_41
    add-int/lit8 v1, v1, 0x1

    if-le v1, v0, :cond_1c

    :cond_45
    return-void
.end method

.method private highlightSyntax(Landroid/text/Editable;)V
    .registers 6

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    return-void

    :cond_9
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/regex/Pattern;

    iget-object v2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    :goto_2f
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-direct {p0, p1, v1, v2}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->createForegroundColorSpan(Landroid/text/Editable;Ljava/util/regex/Matcher;I)V

    goto :goto_2f

    :cond_39
    return-void
.end method

.method private highlightWithoutChange(Landroid/text/Editable;)V
    .registers 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->modified:Z

    invoke-direct {p0, p1}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->highlight(Landroid/text/Editable;)Landroid/text/Editable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->modified:Z

    return-void
.end method

.method private initEditorView()V
    .registers 5

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->_rect:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lpaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lpaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lpaint:Landroid/graphics/Paint;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lpaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getTextSize()F

    move-result v2

    iget v3, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->LINE_NUMBER_TEXTSIZE_GAP:I

    int-to-float v3, v3

    sub-float/2addr v2, v3

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mAutoCompleteTokenizer:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    if-nez v0, :cond_37

    new-instance v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/KeywordTokenizer;

    invoke-direct {v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/KeywordTokenizer;-><init>()V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mAutoCompleteTokenizer:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    :cond_37
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mAutoCompleteTokenizer:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-virtual {p0, v0}, Landroid/widget/MultiAutoCompleteTextView;->setTokenizer(Landroid/widget/MultiAutoCompleteTextView$Tokenizer;)V

    invoke-virtual {p0, v1}, Landroid/widget/MultiAutoCompleteTextView;->setHorizontallyScrolling(Z)V

    new-array v0, v1, [Landroid/text/InputFilter;

    const/4 v1, 0x0

    new-instance v2, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$1;

    invoke-direct {v2, p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView$1;-><init>(Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;)V

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Landroid/widget/MultiAutoCompleteTextView;->setFilters([Landroid/text/InputFilter;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mEditorTextWatcher:Landroid/text/TextWatcher;

    invoke-virtual {p0, v0}, Landroid/widget/MultiAutoCompleteTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method


# virtual methods
.method public addErrorLine(II)V
    .registers 4

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->hasErrors:Z

    return-void
.end method

.method public addSyntaxPattern(Ljava/util/regex/Pattern;I)V
    .registers 4

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public cancelHighlighterRender()V
    .registers 3

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateHandler:Landroid/os/Handler;

    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public clearAutoIndentCharacterList()V
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mIndentCharacterList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public getAutoIndentCharacterList()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mIndentCharacterList:Ljava/util/List;

    return-object v0
.end method

.method public getErrorsSize()I
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    invoke-interface {v0}, Ljava/util/SortedMap;->size()I

    move-result v0

    return v0
.end method

.method public getLineNumberMarginGap()I
    .registers 2

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberMarginGap:I

    return v0
.end method

.method public getLineNumberTextColor()I
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lpaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getSyntaxPatternsSize()I
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public getTextWithoutTrailingSpace()Ljava/lang/String;
    .registers 3

    sget-object v0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->PATTERN_TRAILING_WHITE_SPACE:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUpdateDelayTime()I
    .registers 2

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateDelayTime:I

    return v0
.end method

.method public isHasError()Z
    .registers 2

    iget-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->hasErrors:Z

    return v0
.end method

.method public isLineNumberVisible()Z
    .registers 2

    iget-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberVisible:Z

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .registers 9

    iget-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberVisible:Z

    if-eqz v0, :cond_56

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lpaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getTextSize()F

    move-result v1

    iget v2, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->LINE_NUMBER_TEXTSIZE_GAP:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getBaseline()I

    move-result v0

    const/4 v1, 0x0

    const-string v2, ""

    move-object v3, v2

    :goto_19
    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getLineCount()I

    move-result v4

    if-ge v1, v4, :cond_3d

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->_rect:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    int-to-float v5, v0

    iget-object v6, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lpaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getLineHeight()I

    move-result v4

    add-int/2addr v0, v4

    goto :goto_19

    :cond_3d
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lpaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberMarginGap:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getPaddingBottom()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/widget/MultiAutoCompleteTextView;->setPadding(IIII)V

    :cond_56
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public reHighlightErrors()V
    .registers 2

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    invoke-direct {p0, v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->highlightErrorLines(Landroid/text/Editable;)V

    return-void
.end method

.method public reHighlightSyntax()V
    .registers 2

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    invoke-direct {p0, v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->highlightSyntax(Landroid/text/Editable;)V

    return-void
.end method

.method public removeAllErrorLines()V
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    invoke-interface {v0}, Ljava/util/SortedMap;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->hasErrors:Z

    return-void
.end method

.method public removeErrorLine(I)V
    .registers 3

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/SortedMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mErrorHashSet:Ljava/util/SortedMap;

    invoke-interface {p1}, Ljava/util/SortedMap;->size()I

    move-result p1

    if-lez p1, :cond_13

    const/4 p1, 0x1

    goto :goto_14

    :cond_13
    const/4 p1, 0x0

    :goto_14
    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->hasErrors:Z

    return-void
.end method

.method public removeSyntaxPattern(Ljava/util/regex/Pattern;)V
    .registers 3

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public resetSyntaxPatternList()V
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public setAutoCompleteTokenizer(Landroid/widget/MultiAutoCompleteTextView$Tokenizer;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mAutoCompleteTokenizer:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    return-void
.end method

.method public setAutoIndentCharacterList(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Character;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mIndentCharacterList:Ljava/util/List;

    return-void
.end method

.method public setLineNumberMarginGap(I)V
    .registers 2

    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberMarginGap:I

    return-void
.end method

.method public setLineNumberTextColor(I)V
    .registers 3

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lpaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setLineNumberVisible(Z)V
    .registers 2

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->lineNumberVisible:Z

    return-void
.end method

.method public setRemoveErrorsWhenTextChanged(Z)V
    .registers 2

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mRemoveErrorsWhenTextChanged:Z

    return-void
.end method

.method public setSyntaxPatternsMap(Ljava/util/Map;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/util/regex/Pattern;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_d
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mSyntaxPatternMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public setTabWidth(I)V
    .registers 4

    iget v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->tabWidthInCharacters:I

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->tabWidthInCharacters:I

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const-string v1, "O`k\u001edjNc9@jj@`<LefA`n@dl\u001agjOfnA3"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v0

    int-to-float p1, p1

    mul-float v0, v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->tabWidth:I

    return-void
.end method

.method public setTextHighlighted(Ljava/lang/CharSequence;)V
    .registers 3

    if-nez p1, :cond_4

    const-string p1, ""

    :cond_4
    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->cancelHighlighterRender()V

    invoke-virtual {p0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->removeAllErrorLines()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->dirty:Z

    iput-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->modified:Z

    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {p0, v0}, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->highlight(Landroid/text/Editable;)Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->modified:Z

    return-void
.end method

.method public setUpdateDelayTime(I)V
    .registers 2

    iput p1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->mUpdateDelayTime:I

    return-void
.end method

.method public showDropDown()V
    .registers 5

    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p0, v0}, Landroid/widget/MultiAutoCompleteTextView;->getLocationOnScreen([I)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, v0}, Landroid/widget/MultiAutoCompleteTextView;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getSelectionStart()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/MultiAutoCompleteTextView;->getLayout()Landroid/text/Layout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v2

    mul-int/lit16 v2, v2, 0x8c

    add-int/lit16 v2, v2, 0x2ee

    int-to-float v2, v2

    iget v3, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->displayDensity:F

    div-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {p0, v2}, Landroid/widget/MultiAutoCompleteTextView;->setDropDownVerticalOffset(I)V

    invoke-virtual {v1, v0}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v0

    iget v1, p0, Lteam/dev/epro/apkcustom/widgets/jsonhighlight/CodeView;->displayDensity:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/MultiAutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->showDropDown()V

    return-void
.end method
