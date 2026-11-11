.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〺つふすそ;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;-><init>()V

    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〺つふすそ;->〺つふすそ:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;)V
    .registers 3

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$くし〴〺ぅ;-><init>()V

    invoke-virtual {p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->いいにぽつ()Landroid/view/WindowInsets;

    move-result-object p1

    new-instance v0, Landroid/view/WindowInsets$Builder;

    if-eqz p1, :cond_f

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_12

    :cond_f
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_12
    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〺つふすそ;->〺つふすそ:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〺つふすそ;->〺つふすそ:Landroid/view/WindowInsets$Builder;

    .line 1
    iget v1, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:I

    iget v2, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:I

    iget v3, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:I

    iget p1, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->びぐびあび:I

    invoke-static {v1, v2, v3, p1}, Landroid/graphics/Insets;->of(IIII)Landroid/graphics/Insets;

    move-result-object p1

    .line 2
    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public くし〴〺ぅ(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〺つふすそ;->〺つふすそ:Landroid/view/WindowInsets$Builder;

    .line 1
    iget v1, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ:I

    iget v2, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->〺つふすそ:I

    iget v3, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:I

    iget p1, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/〺つふすそ;->びぐびあび:I

    invoke-static {v1, v2, v3, p1}, Landroid/graphics/Insets;->of(IIII)Landroid/graphics/Insets;

    move-result-object p1

    .line 2
    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public げつ〴ぬぐ()Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻$〺つふすそ;->〺つふすそ:Landroid/view/WindowInsets$Builder;

    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;->ぺふねづ〺(Landroid/view/WindowInsets;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method
