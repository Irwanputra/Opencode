.class public Lcom/google/android/material/chip/ChipGroup$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/chip/ChipGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/google/android/material/chip/ChipGroup;


# direct methods
.method public constructor <init>(Lcom/google/android/material/chip/ChipGroup;Lcom/google/android/material/chip/ChipGroup$げつ〴ぬぐ;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/google/android/material/chip/ChipGroup$〺つふすそ;->〺つふすそ:Lcom/google/android/material/chip/ChipGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .registers 5

    iget-object v0, p0, Lcom/google/android/material/chip/ChipGroup$〺つふすそ;->〺つふすそ:Lcom/google/android/material/chip/ChipGroup;

    .line 1
    iget-boolean v1, v0, Lcom/google/android/material/chip/ChipGroup;->へぬ〴づぞ:Z

    if-eqz v1, :cond_7

    return-void

    .line 2
    :cond_7
    invoke-virtual {v0}, Lcom/google/android/material/chip/ChipGroup;->getCheckedChipIds()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2a

    iget-object v0, p0, Lcom/google/android/material/chip/ChipGroup$〺つふすそ;->〺つふすそ:Lcom/google/android/material/chip/ChipGroup;

    .line 3
    iget-boolean v1, v0, Lcom/google/android/material/chip/ChipGroup;->ぺぁあねじ:Z

    if-eqz v1, :cond_2a

    .line 4
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result p2

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, p2, v1}, Lcom/google/android/material/chip/ChipGroup;->くし〴〺ぅ(IZ)V

    .line 6
    iget-object p2, p0, Lcom/google/android/material/chip/ChipGroup$〺つふすそ;->〺つふすそ:Lcom/google/android/material/chip/ChipGroup;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result p1

    .line 7
    iput p1, p2, Lcom/google/android/material/chip/ChipGroup;->のぷのちつ:I

    iget-object p1, p2, Lcom/google/android/material/chip/ChipGroup;->いいにぽつ:Lcom/google/android/material/chip/ChipGroup$くし〴〺ぅ;

    return-void

    .line 8
    :cond_2a
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result p1

    const/4 v0, -0x1

    if-eqz p2, :cond_47

    iget-object p2, p0, Lcom/google/android/material/chip/ChipGroup$〺つふすそ;->〺つふすそ:Lcom/google/android/material/chip/ChipGroup;

    .line 9
    iget v1, p2, Lcom/google/android/material/chip/ChipGroup;->のぷのちつ:I

    if-eq v1, v0, :cond_41

    if-eq v1, p1, :cond_41

    .line 10
    iget-boolean v0, p2, Lcom/google/android/material/chip/ChipGroup;->〳ぜぞぜべっ:Z

    if-eqz v0, :cond_41

    const/4 v0, 0x0

    .line 11
    invoke-virtual {p2, v1, v0}, Lcom/google/android/material/chip/ChipGroup;->くし〴〺ぅ(IZ)V

    .line 12
    :cond_41
    iget-object p2, p0, Lcom/google/android/material/chip/ChipGroup$〺つふすそ;->〺つふすそ:Lcom/google/android/material/chip/ChipGroup;

    invoke-static {p2, p1}, Lcom/google/android/material/chip/ChipGroup;->〺つふすそ(Lcom/google/android/material/chip/ChipGroup;I)V

    goto :goto_50

    :cond_47
    iget-object p2, p0, Lcom/google/android/material/chip/ChipGroup$〺つふすそ;->〺つふすそ:Lcom/google/android/material/chip/ChipGroup;

    .line 13
    iget v1, p2, Lcom/google/android/material/chip/ChipGroup;->のぷのちつ:I

    if-ne v1, p1, :cond_50

    .line 14
    invoke-static {p2, v0}, Lcom/google/android/material/chip/ChipGroup;->〺つふすそ(Lcom/google/android/material/chip/ChipGroup;I)V

    :cond_50
    :goto_50
    return-void
.end method
