.class public Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;
.super Landroid/widget/TextView;
.source ""


# static fields
.field public static final づざかべべ:Landroid/graphics/Typeface;

.field public static final なぎぱいぢぎ:Landroid/graphics/Typeface;


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:Ljava/lang/String;

.field public びぐびあび:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    const-string v0, "san-serif"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->づざかべべ:Landroid/graphics/Typeface;

    const-string v0, "sans-serif-condensed"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ:I

    const-string p2, ""

    iput-object p2, p0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->くし〴〺ぅ:Ljava/lang/String;

    iput-object p2, p0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->びぐびあび:Ljava/lang/String;

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/〳ぜぞぜべっ;->number_picker_seperator:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/〳ぜぞぜべっ;->time_picker_time_seperator:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->びぐびあび:Ljava/lang/String;

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    return-void
.end method


# virtual methods
.method public setPaddingRight(I)V
    .registers 2

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ:I

    invoke-virtual {p0}, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->げつ〴ぬぐ()V

    return-void
.end method

.method public 〺つふすそ()V
    .registers 5

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    const v1, -0x41ab020c    # -0.208f

    mul-float v0, v0, v1

    float-to-int v0, v0

    iget v2, p0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ:I

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v3

    mul-float v3, v3, v1

    float-to-int v1, v3

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v2, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    return-void
.end method

.method public げつ〴ぬぐ()V
    .registers 6

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    const v1, 0x3e54fdf4    # 0.208f

    if-eqz v0, :cond_24

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, v2}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    const v0, 0x3e54fdf4    # 0.208f

    const v2, 0x3e54fdf4    # 0.208f

    goto :goto_29

    :cond_24
    const v0, 0x3ea7ef9e    # 0.328f

    const/high16 v2, 0x3e800000    # 0.25f

    :goto_29
    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    if-eqz v3, :cond_41

    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    sget-object v4, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->づざかべべ:Landroid/graphics/Typeface;

    invoke-virtual {v3, v4}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_41

    const v0, 0x3e54fdf4    # 0.208f

    const v2, 0x3e54fdf4    # 0.208f

    :cond_41
    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    if-eqz v3, :cond_57

    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    sget-object v4, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->なぎぱいぢぎ:Landroid/graphics/Typeface;

    invoke-virtual {v3, v4}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_57

    const v2, 0x3e54fdf4    # 0.208f

    goto :goto_58

    :cond_57
    move v1, v0

    :goto_58
    const/4 v0, 0x0

    neg-float v1, v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v3

    mul-float v3, v3, v1

    float-to-int v1, v3

    iget v3, p0, Lcom/codetroopers/betterpickers/widget/ZeroTopPaddingTextView;->〺つふすそ:I

    neg-float v2, v2

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v4

    mul-float v4, v4, v2

    float-to-int v2, v4

    invoke-virtual {p0, v0, v1, v3, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    return-void
.end method
