.class public abstract Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:Landroid/content/Context;

.field public くし〴〺ぅ:Lcom/google/android/material/internal/CheckableImageButton;

.field public げつ〴ぬぐ:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->げつ〴ぬぐ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->〺つふすそ:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEndIconView()Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object p1

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/おかぷせ〱/のぷのちつ;->くし〴〺ぅ:Lcom/google/android/material/internal/CheckableImageButton;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(I)Z
    .registers 2

    const/4 p1, 0x1

    return p1
.end method

.method public くし〴〺ぅ(Z)V
    .registers 2

    return-void
.end method

.method public abstract げつ〴ぬぐ()V
.end method

.method public びぐびあび()Z
    .registers 2

    const/4 v0, 0x0

    return v0
.end method
